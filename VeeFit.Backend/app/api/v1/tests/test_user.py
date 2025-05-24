import pytest
from fastapi import HTTPException, status
from sqlalchemy.orm import Session
from unittest.mock import MagicMock
from database.db_user import create_user
from database.models import DBUser
from database.hash import Hash
from schemas import UserDetails

# Mock data
TEST_USER = UserDetails(
    user_name="testuser",
    email="test@example.com",
    password="plaintextpassword"
)

def test_user_creation_success(mocker):
    # Setup mock DB session
    mock_db = MagicMock(spec=Session)
    mock_db.query.return_value.filter.return_value.first.return_value = None  # Simulate no existing user
    
    # Call the function
    result = create_user(db=mock_db, data=TEST_USER)
    
    # Verify password was hashed
    assert result.password != TEST_USER.password
    assert Hash.verify(result.password, TEST_USER.password)
    
    # Verify user fields
    assert result.user_name == TEST_USER.user_name
    assert result.email == TEST_USER.email
    
    # Verify DB operations
    mock_db.add.assert_called_once()
    mock_db.commit.assert_called_once()
    mock_db.refresh.assert_called_once()

def test_duplicate_email_rejection(mocker):
    # Setup mock to return existing user
    mock_db = MagicMock(spec=Session)
    mock_db.query.return_value.filter.return_value.first.return_value = DBUser(email=TEST_USER.email)
    
    # Verify exception is raised
    with pytest.raises(HTTPException) as exc_info:
        create_user(db=mock_db, data=TEST_USER)
    
    assert exc_info.value.status_code == status.HTTP_409_CONFLICT
    assert "Email already registered" in str(exc_info.value.detail)
import pytest
from database.hash import Hash

def test_password_hashing():
    # Test that a password is hashed and not stored plainly
    plain_password = "secret123"
    hashed_password = Hash.dcrypt(plain_password)  # Note: Typo? Should it be `encrypt`?
    
    # Check the password is hashed (not plaintext)
    assert hashed_password != plain_password
    assert len(hashed_password) > 0  # Basic check for a hash

def test_password_verification():
    # Test that verification works
    plain_password = "secret123"
    hashed_password = Hash.dcrypt(plain_password)
    
    # Correct password should verify
    assert Hash.verify(hashed_password, plain_password) is True
    
    # Wrong password should fail
    assert Hash.verify(hashed_password, "wrongpassword") is False
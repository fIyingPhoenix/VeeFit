from pydantic import BaseModel

class UserDetailsUpdatable(BaseModel):
    email : str = None
    password : str = None

class UserDetails(UserDetailsUpdatable):
    user_name : str

class UserDisplay(BaseModel):
    user_name : str
    email : str = None
    class Config():   #to convert the model to this
        from_attributes = True
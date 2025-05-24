class Config:
    SQLALCHEMY_DATABASE_URL = "sqlite:///./VeeFit.db"

    SECTER_KEY = "Some random secret key"
    ALOGRITHM = "HS256"
    ACCESS_TOKEN_EXPIRE_MINUTES = 30

    SHORT_URL_LENGTH = 8
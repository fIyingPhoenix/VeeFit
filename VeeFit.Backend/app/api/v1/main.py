from fastapi import FastAPI
from authentication import auth_router
from database import engine, models
from routers import user

app = FastAPI(
    title="VeeFit",
    description="VeeFit is a modern, open-source nutrition and fitness tracking platform designed for individuals and coaches who want to track meals, monitor fitness progress, and reach health goals all from any device."
)
models.Base.metadata.create_all(engine)

app.include_router(auth_router.router)
app.include_router(user.router)

@app.get("/health")
async def health_check():
    return {"message": "HEALTHY"}
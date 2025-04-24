# Datenbankmodelle (Meal, FoodItem)

from django.db import models 
from django.contrib.auth.models import User

class FoodItem(models.Model):
    name = models.CharField(max_length=100)
    calories_per_100g = models.FloatField()

class Meal(models.Model):
    user = models.ForeignKey(User, on_delete=models.CASCADE)
    food = models.ForeignKey(FoodItem, on_delete=models.CASCADE)
    quantity = models.FloatField(help_text= "Gramm")
    meal_type = models.CharField(choices=[
        ("breakfast", "Breakfast"), 
        ("lunch", "Lunch"), ("dinner", "Dinner") 
    ], max_length=20)
    datetime = models.DateTimeField(auto_now_add=True)
# Funktionen für API-Endpunkte


# API-Endpunkt zur Registrierung   
from django.contrib.auth.models import User
from rest_framework import generics
from rest_framework.permissions import AllowAny
from rest_framework.serializers import ModelSerializer
class RegisterView(generics.CreateAPIView):
    queryest = User.object.all()
    permission_classes = (AllowAny,)
    serializer_class = RegisterSerializer

import requests
from rest_framework.decorators import api_view
from rest_framework.response import Response

@api_view(['GET'])
def get_calories(request):
    food = request.GET.get('food', '')
    url = f'https://api.calorieninjas.com/v1/nutrition?query={food}'
    headers = {'X-Api-Key': 'DEIN_API_KEY'}
    r = requests.get(url, headers=headers)
    return Response(r.json())

from django.utils.timezone import now
from datetime import timedelta
from .models import Meal

# Tages-Kalorien zusammenfassen für aktuellen Benutzer
@api_view(['GET'])
def daily_summary(request):
    today = now().date()
    meals = Meal.objects.filter(user=request.user, datetime__date=today)
    total = sum([m.food.calories_per_100g * m.quantity / 100 for m in meals])
    return Response({"total_calories": total})
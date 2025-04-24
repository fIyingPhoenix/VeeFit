# Serialisierung von Daten (Model ↔ JSON)

from django.contrib.auth.models import User
from rest_framework import generics
from rest_framework.permission import AllowAny
from rest_framework.serializers import ModelSerializer

# Serialisierung von Userdaten für Registierung 
class RegisterSerializer(ModelSerializer):
    class Meta:
        model = User 
        fields = ('username','password')
    def create(self, validated_data):       # Passwort wird sicher gehasht gespeichert
        user = User.objects.create_user(**validated_data)
        return user
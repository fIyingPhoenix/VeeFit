# URLs der App (/api/meals/)

from django.urls import path
from .views import RegisterView

urlpatterns = [
    path('register/', RegisterView.as_view(), name ='register'),

]

from .views import get_calories
# Route zur Kalorienabfrage
urlpatterns += [
    path('calories/', get_calories, name='get_calories'),
]


# URL ergänzen für Tagesübersicht
urlpatterns += [
    path('summary/daily/', daily_summary , name='daily_summary'),
]
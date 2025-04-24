# Globale konfigurationen

Installed_APPs = [          # Aktiverung von REST Framework, Auth-Token, CORS und Eigener App
    'rest_framework',
    'rest_framework_simplejwt',
    'corsheaders',
    'meals',
]

Middleware = [              # CORS Middleware für API-Zugriff von Frontends
    'corsheaders.middleware.CorsMiddleware',
]

CORS_ALLOW-ALL_ORIGINS = True # Erlaube API-Zugriff von allen Quellen(für Entwicklung) 

REST_Framework = {          # Authentifizierung über JWT-Tokens aktivieren
    'default_Authentication_Classes': (
        'rest_framework_simplejwt.authentication.JWTAuthentication',
    ),
}
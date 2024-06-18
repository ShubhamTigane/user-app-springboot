
# User-App-Springboot

This is a Spring Boot application for user registration, including RESTful APIs for user registration and fetching user details.



## Prerequisites
- Java 11 or higher
- Maven
- MySQL or another compatible database


## API Reference

#### Register a User

```http
  POST /api/user/register
```

#### CURL Command 
```http
 curl -X POST "http://localhost:8080/api/user/register" \
 -H "Content-Type: application/json" \
 -d '{
        "username": "virat_kohli",
        "email": "virat.kohli@example.com",
        "password": "password123"
    }'
```

#### Fetch User Details

```http
 GET /api/user/fetch?username=virat_kohli
```
#### CURL Command
```http
 curl -X GET "http://localhost:8080/api/user/fetch?username=virat_kohli"

```


## Setup Instructions

### Clone the Repository
```bash
git clone https://github.com/ShubhamTigane/user-app-springboot.git
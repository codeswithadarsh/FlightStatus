# Flight Status and Notification System

## Introduction

Welcome to the Flight Status and Notification System! This project is designed to provide real-time updates on flight status and notifications to passengers. Whether you need to track delays, cancellations, or gate changes, this system has got you covered.

![Image](https://blogger.googleusercontent.com/img/a/AVvXsEgGR1VIJ1MlgtaoWnPqEvhKfF1QMIjPBT3Ej5abaofCI5x_Cbecu-lq4PXon4LtP7LLfX2z8gN5IyswwcjnnRFcvX4rvff9UI8w810Kb8DdLeiH6BOVWDxTEKrDtFMKR6MWeq04uuYjYUefkwuDQB67mK0LkoO8NSDOIh5bBSDuXsW5nI91sYvqgvmDwdA=s16000)

### Updated Flight Status by Postman

![updated](https://blogger.googleusercontent.com/img/a/AVvXsEgZySIxeVvNWMH1LSTntgECcSqqj4vOplX6ibg_1DdNYTYHQkgntoxfx6TwC35NVJAPnZQfsgvOBnRUFtzjnt_8-1NB7weBcTDR1KKn2GnSliSNLHecTxh9FWwQ-IefxDXMSaG3GNvqmf7sx0gmF0vlzrPbIYNGFQp-Eucvg9_1WtI-QcN22OUaTSqS-Oc=s16000)

## Features

1. **Real-time Updates:** Always know the current status of your flight.
2. **Push Notifications:** Get notified about flight status changes via SMS notifications using Firebase Cloud Messaging.

## Technologies Used

### Frontend

- **React.js:** A powerful JavaScript library for building dynamic user interfaces.
- **HTML:** The backbone of our web pages.
- **CSS:** Makes our application look good.

### Backend

- **Java & Spring Boot:** Our choice for building a robust backend server.
- **Maven:** Helps manage our Java project's build process.
- **WebSocket:** Enables real-time communication between the server and the client.
- **Firebase Cloud Messaging:** Sends reliable push notifications to users.

### Database

- **MongoDB Atlas:** A cloud-based, scalable NoSQL database.

## Project Structure

### Backend (Java & Spring Boot)

1. **Controller:** Manages HTTP requests and routes them to the appropriate service. I have created FlightController.java file.
2. **Service:** Contains the business logic.
3. **Repository:** Interacts with MongoDB to perform CRUD operations.
4. **Model:** Represents the flight data structure. I have created Flight.java file in Model.

### Frontend (React)

1. **Components:** Reusable UI elements.
2. **State Management:** Manages the state of the application.
3. **Axios:** Makes HTTP requests to our backend server.

### WebSocket

1. **Real-time Updates:** Keeps the frontend updated with the latest flight status without needing to refresh the page.

### Firebase

1. **Notifications:** Sends notifications to users about flight status changes.

## Setup and Installation

### Prerequisites

Before start, make sure you have the following installed:

1. **Java Development Kit (JDK) 11 or higher**
2. **Node.js and npm (Node Package Manager)**
3. **MongoDB Atlas account**
4. **Firebase account**

### Backend Setup

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/flight-status.git
   cd flight-status/backend

2. **Build and Run the Spring Boot Application**
    ```bash
    ./mvnw spring-boot:run

### Frontend Setup

1. **Navigate to the Frontend Directory**
    ```bash
    cd ../frontend
2. **Install Dependencies**
    ```bash
    npm install
3. **Start the React Application**
    ```bash
    npm start

### Demo Data for MongoDB
To create and update flight data, use Postman or a similar tool to send HTTP requests to the backend.

    {
    "flightNumber": "AA123",
    "status": "On Time",
    "gate": "A12",
    "departureTime": "2024-07-26T15:30:00",
    "arrivalTime": "2024-07-26T18:30:00"
}

**PUT /api/flights/{id}**

    {
    "flightNumber": "AA123",
    "status": "Delayed",
    "gate": "A14",
    "departureTime": "2024-07-26T16:00:00",
    "arrivalTime": "2024-07-26T19:00:00"
     }



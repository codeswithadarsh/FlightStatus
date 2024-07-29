# Flight Status and Notification System

##  📋 Introduction

I developed a system to provide real-time flight status updates and notifications to passengers. The system aims to keep passengers informed about their flight status, including any delays, cancellations, and gate changes, through real-time updates and push notifications.

![Image](https://blogger.googleusercontent.com/img/a/AVvXsEgGR1VIJ1MlgtaoWnPqEvhKfF1QMIjPBT3Ej5abaofCI5x_Cbecu-lq4PXon4LtP7LLfX2z8gN5IyswwcjnnRFcvX4rvff9UI8w810Kb8DdLeiH6BOVWDxTEKrDtFMKR6MWeq04uuYjYUefkwuDQB67mK0LkoO8NSDOIh5bBSDuXsW5nI91sYvqgvmDwdA=s16000)

### Updated Flight Status by Postman

![updated](https://blogger.googleusercontent.com/img/a/AVvXsEgZySIxeVvNWMH1LSTntgECcSqqj4vOplX6ibg_1DdNYTYHQkgntoxfx6TwC35NVJAPnZQfsgvOBnRUFtzjnt_8-1NB7weBcTDR1KKn2GnSliSNLHecTxh9FWwQ-IefxDXMSaG3GNvqmf7sx0gmF0vlzrPbIYNGFQp-Eucvg9_1WtI-QcN22OUaTSqS-Oc=s16000)

## Features

1. **📊Real-time Updates:** I created a feature to display the current status of flights. This includes updates on delays, cancellations, and gate changes. The data is fetched from the backend and displayed to users in real-time.

2. **📲 Push Notifications:** Passengers receive notifications about any changes in flight status. These notifications can be sent via app notifications. I used Firebase Cloud Messaging (FCM) to handle the notifications, ensuring that passengers stay informed without constantly checking the app.Messaging.

3. **📈 Data Integration:** Used Postman to create dummy data and fetch it from MongoDB for accurate flight information.

## 🌐 Technologies Used

### Frontend

- **React.js:** A powerful JavaScript library for building dynamic user interfaces.
- **HTML:** The backbone of our web pages.
- **CSS:** Makes our application look good.

  ```
  I used React.js along with HTML and CSS to build a responsive and user-friendly interface. The React components display real-time flight information and handle user interactions.
### Backend

- **Java & Spring Boot:** Our choice for building a robust backend server.
- **Maven:** Helps manage our Java project's build process.
- **WebSocket:** Enables real-time communication between the server and the client.
- **Firebase Cloud Messaging:** Sends reliable push notifications to users.

  ```
  I chose Java for the backend, utilizing Spring Boot to manage the application's RESTful services. The backend handles data storage, retrieval, and the business logic required to process flight status updates.
### Database

- **MongoDB Atlas:** MongoDB was used as the database to store flight information. It allowed for flexible and efficient storage and retrieval of flight data, which is essential for real-time updates.

   ```
   For sending push notifications, I integrated Firebase Cloud Messaging (FCM). This service handles the delivery of notifications to users' devices, ensuring they receive updates promptly.
## 🗄️ Project Structure

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

## 🛠️ Implementation Process

### 🖥️ Frontend Development 

I created a React application to display flight information. The application fetches data from the backend and updates the UI in real-time. I also set up Firebase in the frontend to handle push notifications.

### ⚙️ Backend Development

Using Spring Boot, I developed RESTful APIs to manage flight data. The backend processes incoming flight updates and sends real-time notifications to the frontend using WebSockets.

### 💾 Database Setup

I configured MongoDB to store flight details. The database schema was designed to accommodate various flight attributes, ensuring efficient data retrieval and updates.

### 🔔 Notification Service

I integrated Firebase Cloud Messaging to send notifications. The service was configured to trigger notifications on flight status changes, ensuring passengers are always informed.


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


### Conclusion
I developed a comprehensive system that provides real-time flight status updates and notifications to passengers. The combination of React.js, Java, MongoDB, and Firebase Cloud Messaging ensures that the system is efficient, responsive, and user-friendly. This project showcases my ability to integrate various technologies to solve real-world problems, providing a seamless experience for users.


# 💸 Coinnect - Full Stack Crypto Trading Platform

Coinnect is a secure and scalable full-stack cryptocurrency trading platform that allows users to buy/sell crypto, manage wallets and portfolios, and perform real-time transactions using public APIs.

---

## 🔥 Features

### 👥 User Authentication
- Secure Login & Registration
- Two-Factor Authentication (2FA)
- Forgot Password recovery using email

### 💱 Crypto Trading
- Real-time crypto data using Gemini & CoinGecko APIs
- Buy and Sell interface supporting multiple cryptocurrencies

### 📈 Portfolio Management
- Monitor holdings and performance in real time
- Visual insights on gains/losses and investment history

### 💼 Wallet Management
- Wallet to Wallet transfers
- Withdraw to Bank Account
- Add Balance to Wallet

### 📜 Transaction History
- Withdrawal History
- Wallet Transaction Logs
- Search cryptocurrency with live price and historical data

---

## 🧠 Tech Stack

### 🖥️ Frontend
- **React.js** – UI Framework
- **Tailwind CSS** – Utility-first CSS styling
- **Redux** – State management
- **Axios** – API request handling
- **React-Router-Dom** – Client-side routing
- **Shadcn UI** – Beautiful pre-built UI components

### ⚙️ Backend
- **Spring Boot** – REST API development
- **MySQL** – Relational database
- **Spring Security** – Authentication & authorization
- **Java Mail Sender** – Email-based OTP and password recovery
- **REST APIs** – Gemini & CoinGecko integrations

### 💳 Payment Gateways
- **Razorpay**
- **Stripe**

---

## 📁 Project Structure
##Backend
##Front in Zip file


```plaintext
coinnect/
├── backend/
│   ├── src/
│   │   ├── main/java/com/coinnect/coinnect/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── domain/
│   │   │   ├── modal/
│   │   │   ├── repository/
│   │   │   ├── request/
│   │   │   ├── response/
│   │   │   ├── service/
│   │   │   └── utils/
│   │   └── resources/
│   ├── pom.xml
│   └── application.properties
│
├── frontend/
│   ├── public/
│   ├── src/
│   │   ├── components/
│   │   ├── pages/
│   │   ├── redux/       # Redux store, actions, reducers
│   │   ├── utils/
│   │   ├── App.js
│   │   └── index.js
│   ├── tailwind.config.js
│   ├── package.json
│   └── .env

│ │ └── index.js
│ ├── tailwind.config.js
│ ├── package.json
│ └── .env

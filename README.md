# ✉️ AI-Powered Email Generator using Gemini API & Java Full Stack

This project is an intelligent email generator that leverages Google's Gemini AI to draft professional, personalized emails. The frontend is built with modern web technologies, and the backend is powered by Java, making it fast, scalable, and secure.

---

## 🚀 Features

- 🤖 AI-generated email drafts using Gemini API
- ✍️ Choose tone (formal, informal, friendly, etc.)
- 📄 Generate emails based on subject + keywords
- 🔒 Secure and scalable Java backend (Spring Boot)
- 🌐 Responsive UI with live preview
- 📤 Copy or send email directly from UI

---

## 🛠️ Tech Stack

🌐 Frontend:
HTML

CSS

JavaScript (or React, if used)

⚙️ Backend:
Java

Spring Boot

🤖 AI Integration:
Gemini AI API (for email generation)

🔗 API Communication:
REST APIs

🔒 Security & Config:
Environment Variables (.env)

CORS Configuration

🗃️ Version Control:
Git

GitHub

🚀 (Optional) Deployment:
Render, Heroku, or Netlify (depending on frontend/backend setup)

---

## ⚙️ Installation & Setup

### Prerequisites:
- Java 17+
- Maven
- Gemini API Key
- Node.js (if React is used)

### Steps:
```bash
# 1. Clone the repository
git clone https://github.com/Manikanta3920/AI_Email_Reply.git
cd AI_Email_Reply

# 2. Set up environment variables
# Create a `.env` file and add:
GEMINI_API_KEY=your_api_key_here

# 3. Start backend (Java Spring Boot)
cd backend
mvn spring-boot:run

# 4. Start frontend (React or static HTML)
cd frontend
npm install
npm start

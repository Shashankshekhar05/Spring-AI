🌟 SpringBoot-AI
A sleek Spring Boot service that wraps the OpenAI Chat API into a simple REST endpoint.

🔍 Table of Contents

🚀 Features

⚙️ Prerequisites

💻 Getting Started

📦 Project Structure

🔧 Configuration

📡 Usage

🐞 Troubleshooting

📖 License

🚀 Features

🖥️ REST API: POST /api/openai accepts a JSON payload and returns AI-generated text.

🔄 Fast Integration: Uses Spring AI starter.

⚙️ Configurable: API key via environment variable for secure deployments.

📈 Debug Logging: Toggle detailed HTTP logs with a single property.

⚙️ Prerequisites

Java: 21 or higher

Maven: 3.6+

OpenAI API Key: Create at platform.openai.com and set as environment variable.

💻 Getting Started

Clone the repo

git clone https://github.com/Shashankshekhar05/Spring-AI.git
cd Spring-AI

Set your API Key

export OPENAI_API_KEY="sk-<YOUR_KEY_HERE>"

Build & Run

mvn clean spring-boot:run

Service will be available at http://localhost:8080.

📦 Project Structure

Spring-AI/
├── pom.xml
└── src/
    └── main/
        ├── java/com/example/springboot_ai/
        │   ├── SpringBootAiApplication.java
        │   ├── controller/
        │   │   └── OpenAIController.java
        │   ├── service/
        │   │   └── OpenAIService.java
        │   └── model/
        │       ├── Question.java
        │       └── Answer.java
        └── resources/
            └── application.properties

🔧 Configuration

File: src/main/resources/application.properties (ignored by Git)

spring.application.name=SpringBoot-AI
spring.ai.openai.api-key=${OPENAI_API_KEY}
logging.level.org.springframework.web=DEBUG

Ensure you never commit your real API key! Use the .gitignore entry:

# Local config (secrets)
src/main/resources/application.properties

📡 Usage

Request

curl -X POST http://localhost:8080/api/openai \
     -H "Content-Type: application/json" \
     -d '{"question":"How are you today?"}'

Response

{
  "answer": "I'm doing great! How can I assist you today?"
}

🐞 Troubleshooting

Error Type

Cause

Solution

404 Not Found

Trailing space/newline in URL

Ensure URL is exactly /api/openai

500 Internal Server Error

chatModel bean missing or exception thrown

Check dependencies, API key, and logs

429 Quota Exceeded

Out of OpenAI quota

Upgrade plan or reduce request rate

📖 License

Distributed under the MIT License. See LICENSE for details.


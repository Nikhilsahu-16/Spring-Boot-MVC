# Spring-Boot-MVC

Spring-Boot-MVC is a web application project built using Spring Boot and MVC architecture. This project follows the Model-View-Controller pattern to create a structured and maintainable web application.

## Features
- Spring Boot framework
- MVC architecture
- Thymeleaf for frontend templating
- Data layer integration
- REST API endpoints

## Tech Stack
- Java
- Spring Boot
- Spring MVC
- Maven
- Thymeleaf
- HTML/CSS

## Installation

### Prerequisites
- JDK 17+
- Maven
- Any IDE (Eclipse, IntelliJ IDEA, VS Code)

### Steps
1. Clone the repository:
   ```sh
   git clone https://github.com/Nikhilsahu-16/Spring-Boot-MVC.git
   ```
2. Navigate to the project folder:
   ```sh
   cd Spring-Boot-MVC
   ```
3. Build the project using Maven:
   ```sh
   mvn clean install
   ```
4. Run the application:
   ```sh
   mvn spring-boot:run
   ```

## Project Structure
```
Spring-Boot-MVC/
│-- .metadata/           # Eclipse metadata
│-- .mvn/wrapper/        # Maven wrapper files
│-- data/                # Database or data-related files
│-- src/                 # Source code
│   │-- main/java/       # Java source code
│   │-- main/resources/  # Application properties and templates
│   │-- test/            # Unit tests
│-- target/              # Compiled output files
│-- pom.xml              # Maven dependencies and configuration
│-- README.md            # Project documentation
```

## Running the Application
Once the application is running, access it via:
```
http://localhost:8080
```

## Deployment
To package the application into a JAR file:
```sh
mvn package
```
To run the JAR file:
```sh
java -jar target/Spring-Boot-MVC-0.0.1-SNAPSHOT.jar
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss proposed modifications.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries, please reach out at [your-email@example.com] or create an issue in the repository.

---



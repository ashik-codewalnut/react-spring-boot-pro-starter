import axios from "axios";

// Replace the placeholder URL with your Spring Boot backend API URL
const BASE_URL = "http://localhost:8080";

export const fetchData = async () => {
  try {
    const response = await axios.get(`${BASE_URL}/api`, {
      headers: {
        // Add your authentication headers here
        Authorization:
          "Basic spring-boot-auth-token-here" /* Here provide the base64 encoded token of spring.security.user.name 
        and spring.security.user.password given in the application.properties file in the Spring Boot project. */,
      },
    });
    return response;
  } catch (error) {
    console.error("Error fetching data:", error);
    throw error;
  }
};

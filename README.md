# currency-exchange-api

This is a RESTful API that provides exchange rate information between different currencies. It uses this external [service](https://apilayer.com/marketplace/description/exchangerates_data-api) to get the exchange rates.

## Prerequisites
* Java 17 or later
* To run and pull Docker images, make sure your local machine have Docker Desktop installed and running. You can download Docker Desktop from the official website: https://www.docker.com/products/docker-desktop.


## Installation
  * Clone the repository to your local machine:
    ```bash
      git clone https://github.com/Ammar-daham/currency-exchange-api.git
    ```

  * Navigate to the project directory:
      ```
        cd currency-exchange-api
      ```

  * Import the app to your preferred IDE, such as Eclipse, and import the app as an existing Maven project.

  * On the root directory of the project, right-click and run as Maven install to install the jar file.

  * To run the API, use either of the following methods:
    1. Using the command line, type the following command:

      ```
        java -jar target/exchange-rest-api-docker.jar
      ```

    2.  In your IDE, right-click on the root directory of the project and run as Java Application.
        Note: Make sure you have the required JDK installed and set in your system's path.

   * Another way to run the app is by pulling the Docker image from DockerHub. Use the following commands:

      ```
        docker pull ammarfad/exchange-rest-api-docker.jar:latest
        docker run -p 8080:8080 ammarfad/exchange-rest-api-docker.jar:latest
      ```
    
 ## API ENDPOINT
 
  [http://localhost:8080/exchange_amount?to=USD&from=EUR&amount=amount](http://localhost:8080/exchange_amount?to=USD&from=EUR&amount=amount)
  
    

https://user-images.githubusercontent.com/32091211/231304637-2d16df54-12c3-462e-9544-5652fc8cb3fc.mov


 
  

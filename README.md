# currency-exchange-api

This is a RESTful API that provides exchange rate information between different currencies. It uses this external [service](https://apilayer.com/marketplace/description/exchangerates_data-api) to get the exchange rates.

## Prerequisites
* Java 17 or later
* To run and pull Docker images, make sure your local machine have Docker Desktop installed and running. You can download Docker Desktop from the official website: https://www.docker.com/products/docker-desktop.


## Installation
* Clone the repository to your local machine:
  ```bash
    git clone git@github.com:Ammar-daham/SSN_rest_api.git
  ```

* Navigate to the project directory:
    ```
      cd SSN_rest_api
    ```
  
* Import the app to your preferred IDE, such as Eclipse, and import the app as an existing Maven project.

* On the root directory of the project, right-click and run as Maven install to install the jar file.

* To run the API, use either of the following methods:
  1. Using the command line, type the following command:
  
    ```
      java -jar target/spring-boot-docker.jar
    ```
  
  2.  In your IDE, right-click on the root directory of the project and run as Java Application.
      Note: Make sure you have the required JDK installed and set in your system's path.
  

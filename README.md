# Spring Boot + Kafka

The goal of this project is to play with kafka, for this, was created "producers" and "consumers" with two topics. First topic is a message topic, after received a message, we logged this message into file and warn to another topic (logged topic) wich message was logged.

## Installation

To run this project you have to run kafka with docker compose and spring boot with mvn.

```bash
# run kafka
docker-compose up -d
# run application
mvn clean spring-boot:run
```


## Usage
The project contains only one GET method endpoint, this endpoint was created to receive and send a message to kafka. To send a message access a browser and send: (http://localhost:8080/test?message=helloooooo).


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License
[MIT](https://choosealicense.com/licenses/mit/)
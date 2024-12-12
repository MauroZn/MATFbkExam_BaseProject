# MATFbkExam Base Project

### Some docker commands:

#### Once the Dockerfile is created, you can build the image with (Go in the right folder where the right Dockerfile is located):

    sudo docker build -t [IMAGE_NAME] -f Dockerfile .

- ***Example:***
####
    sudo docker build -t configuration-server -f Dockerfile .
    sudo docker build -t configuration-client -f Dockerfile .
    sudo docker build -t catalog -f Dockerfile .
    sudo docker build -t order -f Dockerfile .
    sudo docker build -t shop-eureka-server -f Dockerfile .
    sudo docker build -t shop-gateway -f Dockerfile .

#### Create a docker-compose.yml in the main folder where all the components (server, client, catalog, etc..) are.
#### Move into this folder, where the docker-compose.yml is, in the terminal and run this command:

    sudo docker compose up


### Useful Commands
#### List containers:

    sudo docker ps -a

#### Delete container:

    sudo docker container rm [CONTAINER_ID]

#### List images

    sudo docker images

#### Delete image:

    sudo docker rmi [IMAGE_NAME]:latest

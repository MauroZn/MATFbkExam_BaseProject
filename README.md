# MATFbkExam Base Project

### Some docker commands:

#### Once the Dockerfile is created, you can build the image with it (Go in the right folder where the correct Dockerfile is located):

    sudo docker build -t [IMAGE_NAME] -f Dockerfile .

- ***Example:***
####
    sudo docker build -t configuration-server -f Dockerfile .
    sudo docker build -t configuration-client -f Dockerfile .
    sudo docker build -t catalog -f Dockerfile .
    sudo docker build -t order -f Dockerfile .
    sudo docker build -t shop-eureka-server -f Dockerfile .
    sudo docker build -t shop-gateway -f Dockerfile .

#### Create a docker-compose.yml in the main folder where all the components are located (server, client, catalog, etc..).
#### From the terminal move into it, where the docker-compose.yml is, and run this command:

    sudo docker compose up

> [!IMPORTANT]
> **To speed up all this process, after creating each Dockerfile, you can directly use docker-compose and skip the docker build part:**

    sudo docker compose up --build



### Useful Commands
#### List containers:

    sudo docker ps -a

#### Delete container:

    sudo docker container rm [CONTAINER_ID]

#### List images

    sudo docker images

#### Delete image:

    sudo docker rmi [IMAGE_NAME]:latest

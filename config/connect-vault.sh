docker exec -it $(docker run -d -v ./vault:/vault --cap-add=IPC_LOCK vault server) /bin/sh

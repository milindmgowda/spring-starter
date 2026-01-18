# spring-starter

## Running with Docker

### Prerequisites
- Docker installed on your system

### Build the Docker Image

From the `spring` directory, run:
```bash
docker build -t spring-app .
```

### Run the Container

To start the application:
```bash
docker run -p 8080:8080 spring-app
```

The application will be accessible at `http://localhost:8080`

### Run in Background

To run the container in the background:
```bash
docker run -d -p 8080:8080 spring-app
```

### Stop the Container

Find the container ID:
```bash
docker ps
```

Stop the container:
```bash
docker stop <container_id>
```

### View Logs

To see the container logs:
```bash
docker logs <container_id>
```

Or follow logs in real-time:
```bash
docker logs -f <container_id>
```
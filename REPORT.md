`git checkout microservices` to start.

# What have been done

## Service discovery
I've added new service `eureka` server to hold service discovery.

Additional I've registered `po` and `pc` modules as discovery clients.

## Api Gateway
I've used `Zuul` spring cloud starter to implement Api Gateway and routing for po/pc modules.

Also `api-gateway` service was registered as discovery client in `eureka` server to be able to route without hardcoded IPs and ports

## Centralized logging
ELK stack was added as part of centralized logging task. 
Fluent service plays sidecar container role. 

I've mounted logs from `po` and `pc` modules to `Fluent` daemon to store/show logs in Elasticsearch/Kibana. 


## Build

```bash
mvn clean package
```

## Prepare environment

```bash
docker-compose up -d
```

## Check logs

* go to `localhost:5601`
* Add new index `fluentd-*` in management section
* Browse logs from `po` and `pc` modules.

## Check Api gateway

```bash
curl --request POST \
  --url http://localhost:8080/mycatalog/catalog \
  --header 'content-type: application/json' \
  --data '{
	"name": "Internet",
	"price": 500
}'
```

```bash
curl --request GET \
  --url http://localhost:8080/mycatalog/catalog/{specification_id}
```

```bash
curl --request PUT \
  --url http://localhost:8080/myorder/catalog/{specification_id}/order
```

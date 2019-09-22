SpringBoot + Prometheus + Grafana + Kafka + Zookeeper + Feign

To test:
1. First add your IP to _conf/prometheus.yml_ and _docker-compose.yml_ **'HOST_IP'**. "ipconfig getifaddr en0"
2. docker-compose up
3. Run SandboxApplication and ResponderApplication
4. Test out kafka: "curl http://localhost:8080/test/kafka?name=john"
5. Test out Zookeeper + Feign: "curl http://localhost:8080/test/echo?name=john"

Prometheus http://localhost:9090/

Grafana http://localhost:3000/ admin/admin

JVM (Micrometer) dashboard - grafana.json

AlertManager http://localhost:9093 sends email alerts to local mail server, email can be viewed in MailHog http://localhost:8025/
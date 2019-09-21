SpringBoot + Prometheus + Grafana + Kafka

To test:
1. First add your IP to conf/prometheus.yml and docker-compose.yml 'HOST_IP'. "ipconfig getifaddr en0"
2. docker-compose up
3. Run SandboxApplication
4. Test it out "curl http://localhost:8080/test?name=john"

Prometheus http://localhost:9090/

Grafana http://localhost:3000/ admin/admin

JVM (Micrometer) dashboard - grafana.json

AlertManager http://localhost:9093 sends email alerts to local mail server, email can be viewed in MailHog http://localhost:8025/
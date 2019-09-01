SpringBoot + Prometheus + Grafana

To test:
1. First add your IP to conf/prometheus.yml 'HOST_IP'. "ipconfig getifaddr en0"
2. docker-compose up
3. Run SandboxApplication
4. Test it out "curl http://localhost:8080/test?name=john"

Prometheus http://localhost:9090/

Grafana http://localhost:3000/ admin/admin

JVM (Micrometer) dashboard - grafana.json



```yaml
solon.app:
  name: powerjob-solon
  group: demo

#::server, password 移到了上级；其它属性在 job 下
solon.cloud.powerjob:
  # Address of PowerJob-server node(s). Ip:port or domain. Multiple addresses should be separated with comma.
  server: 127.0.0.1:7700
  # If use PowerjobClient to submit a job, you need to set this property.
  password: powerjob123
  job:
    # Transport port, default is 27777
    port: 28888
    # transport protocol between server and worker
    protocol: akka
    # Store strategy of H2 database. disk or memory. Default value is disk.
    storeStrategy: disk
    # Max length of result. Results that are longer than the value will be truncated.
    maxResultLength: 4096
    # Max length of appended workflow context . Appended workflow context value that is longer than the value will be ignore.
    maxAppendedWfContextLength: 4096
```
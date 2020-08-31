This is a sandbox project for getting used to HTTPS via Spring Boot.

## Create a Key Store

keytool -genkeypair -alias testkeystore -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore testkeystore.p12 -validity 3650
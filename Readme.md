sample component for servicemix
for ittelkom :)

tata cara, setelah clone project ini:
1. Read *.pom dulu supaya paham
2. Download servicemix versi 5.0.0
3. Ektrak servicemix kemana aja sesuka hati tapi sebaiknya ditempat gampang diakses dan tidak memiliki spasi pada nama folder
4. sesuaikan  <custom.build.directory>../apache-servicemix-5.0.0/deploy</custom.build.directory> pada file *.pom
5. copy file com.codencare.cfg ke etc di folder servicemix
6. jalankan servicemix (<servicemix_home>/bin/servicemix.[bat/sh])
7. setelah masuk servicemix/karaf console install fitur yang dibutuhkan dengan menjalankan command sbb
   "features:install  camel-jdbc camel-netty camel-stream"
   ini harus disesuaikan dengan dependency yang ada di pom.xml.
8. build project, bisa dikonsole pakai maven 3.04, atau lebih mudah buka pakai netbeans atau eclipse, pastikan mavennya 3.0.x yang baru ada bugnya.
sample component for servicemix
for ittelkom :)

tata cara, setelah clone project ini:<br/>
1. Read *.pom dulu supaya paham<br/>
2. Download servicemix versi 5.x.x, jangan lupa sesuaikan versi camelnya, antara yang ada diservice mix dengan yang ada di pom.xml<br/>
3. Ektrak servicemix kemana aja sesuka hati tapi sebaiknya ditempat gampang diakses dan tidak memiliki spasi pada nama folder<br/>
4. sesuaikan  <custom.build.directory>../apache-servicemix-5.x.x/deploy</custom.build.directory> pada file *.pom<br/>
5. copy file com.codencare.cfg ke etc di folder servicemix<br/>
6. jalankan servicemix (<servicemix_home>/bin/servicemix.[bat/sh])<br/>
7. setelah masuk servicemix/karaf console install fitur yang dibutuhkan dengan menjalankan command contoh.
   "features:install  camel-jdbc camel-netty camel-stream"
   ini harus disesuaikan dengan dependency yang ada di pom.xml.<br/>
8. build project, bisa dikonsole pakai maven 3.04, atau lebih mudah buka pakai netbeans atau eclipse, pastikan mavennya 3.0.x yang baru ada bugnya.<br/>


berikut daftar bundle yang terinstall sebagai acuan
<pre>
karaf@root> list
START LEVEL 100 , List Threshold: 50
   ID   State         Blueprint      Spring    Level  Name
[  81] [Active     ] [            ] [       ] [   50] geronimo-annotation_1.0_spec (1.1.1)
[  82] [Active     ] [            ] [       ] [   50] geronimo-jms_1.1_spec (1.1.1)
[  83] [Active     ] [            ] [       ] [   50] geronimo-j2ee-management_1.1_spec (1.0.1)
[  84] [Active     ] [            ] [       ] [   50] JAXB2 Basics - Runtime (0.6.4)
[  85] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Bundles :: jaxb-impl (2.2.1.1_2)
[  86] [Active     ] [            ] [       ] [   50] Commons Pool (1.6.0)
[  87] [Active     ] [            ] [       ] [   50] Commons Net (3.3.0)
[  88] [Active     ] [            ] [       ] [   50] ZooKeeper Bundle (3.4.5)
[  89] [Active     ] [            ] [       ] [   50] Apache XBean :: Spring (3.16.0)
[  90] [Active     ] [Created     ] [       ] [   50] activemq-osgi (5.10.0)
[  91] [Active     ] [Created     ] [       ] [   50] activemq-karaf (5.10.0)
[  92] [Active     ] [            ] [       ] [   50] Commons Collections (3.2.1)
[  93] [Active     ] [            ] [       ] [   50] Commons Lang (2.6)
[  94] [Active     ] [            ] [       ] [   50] Commons Codec (1.4)
[  95] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Bundles :: velocity (1.7.0.6)
[  96] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Bundles :: jasypt (1.9.1.1)
[  97] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Specs :: Stax API 1.0 (1.9.0)
[  98] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Bundles :: xpp3 (1.1.0.4c_5)
[  99] [Active     ] [            ] [       ] [   50] Joda-Time (1.6.2)
[ 100] [Active     ] [            ] [       ] [   50] Apache ServiceMix :: Bundles :: xstream (1.4.7.1)
[ 101] [Active     ] [            ] [       ] [   50] Apache Aries Transaction Manager (1.0.0)
[ 102] [Active     ] [            ] [       ] [   50] geronimo-j2ee-connector_1.5_spec (2.0.0)
[ 103] [Active     ] [            ] [       ] [   50] Apache Aries Util (1.0.0)
[ 104] [Active     ] [            ] [       ] [   50] activeio-core (3.1.4)
[ 105] [Active     ] [            ] [       ] [   50] jettison (1.3.5)
[ 106] [Active     ] [            ] [       ] [   50] Jackson JSON processor (1.9.12)
[ 107] [Active     ] [            ] [       ] [   50] Data mapper for Jackson JSON processor (1.9.12)
[ 108] [Active     ] [            ] [       ] [   50] Scala Standard Library (2.11.0.v20140415-163722-cac6383e66)
[ 116] [Active     ] [            ] [       ] [   50] camel-core (2.14.1)
[ 117] [Active     ] [Created     ] [       ] [   50] camel-karaf-commands (2.14.1)
[ 118] [Active     ] [            ] [       ] [   50] camel-jms (2.14.1)
[ 124] [Active     ] [            ] [       ] [   50] camel-spring (2.14.1)
[ 125] [Active     ] [Created     ] [       ] [   50] camel-blueprint (2.14.1)
[ 126] [Active     ] [            ] [       ] [   50] activemq-camel (5.10.0)
[ 197] [Active     ] [Created     ] [       ] [   50] camel-cxf-transport (2.14.1)
[ 198] [Active     ] [Created     ] [       ] [   50] camel-cxf (2.14.1)
[ 199] [Active     ] [Created     ] [       ] [   50] Apache ServiceMix :: ActiveMQ :: Service (5.4.0)
[ 200] [Active     ] [Created     ] [       ] [   50] Apache ServiceMix :: ActiveMQ :: Camel (5.4.0)
[ 211] [Active     ] [Created     ] [       ] [   80] Absen Communication (0.1.0)
[ 213] [Active     ] [            ] [       ] [   50] Jackson-annotations (2.4.1)
[ 214] [Active     ] [            ] [       ] [   50] Jackson-module-JAXB-annotations (2.4.1)
[ 215] [Active     ] [            ] [       ] [   50] Jackson-core (2.4.1)
[ 216] [Active     ] [            ] [       ] [   50] jackson-databind (2.4.1)
[ 217] [Active     ] [            ] [       ] [   50] camel-jackson (2.14.1)
[ 233] [Active     ] [            ] [       ] [   50] camel-jdbc (2.14.1)
[ 234] [Active     ] [            ] [       ] [   80] Commons DBCP (1.4)
[ 235] [Active     ] [            ] [       ] [   80] Oracle Corporation's JDBC Driver for MySQL (5.1.34)
</pre>
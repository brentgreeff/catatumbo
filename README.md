# Learning catatumbo - TDD

### Guard - TDD

`bundle install` - to get the `listen` gem.

`./guard.rb` - to start watching your files. - [save] a test to run it automatically. - [save] a class and the corresponding test will be run.

### General dev setup

Install JDK 8 from Oracle - https://www.oracle.com/java/technologies/downloads/#java8

Download Maven: https://maven.apache.org/download.cgi

Add to path: `export PATH="/Users/brent/apache-maven-3.8.2/bin:$PATH"`

new to Maven? - https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

`mvn archetype:generate -DgroupId=cata -DartifactId=cat -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false`

`export JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_301.jdk/Contents/Home/"`

`mvn package` - to download jars and create project structure.

`mvn -Dtest=cat.PersonTest test` - to run a single test.

http://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html

### Editor support

I am using Atom, with the https://github.com/atom/ide-java package. - Based on the [Eclipse JDT Language Server](https://github.com/eclipse/eclipse.jdt.ls)

Seems something similar is available for Sublime:
See:
- https://github.com/sublimelsp/LSP-jdtls
- http://dplatz.de/blog/2019/sublime-lsp.html


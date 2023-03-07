<h1 align="center">Building a web app with Scala and PlayFramework</h1>
<div align="center">
<h3>What is this readme for</h3>
<p>
In this readme I will document most difficults what I found
for in the journey
</p>
</div>

<h3>My setup and versions</h3>
<ul>
<li>Notebook: I7, Win11.</li> 
<li>Java: JDK 11.0.17</li>
<li>Scala: 3.2.2</li>
<li>PlayFramework: 2.8.9</li>
<li>IDE's: IntelliJ, VSCode</li>
<li>Browser: OperaGX</li>
</ul>

<hr>

<h2>Starting the project</h2>
<p>Open terminal in anyone directory and execute this command</p>

```
sbt new playframework/play-scala-seed.g8
```

<p>
Set the project name (new directory will be created with this name)
and run this other two commands
</p>

```
cd [name-you-gave]
sbt run
```

<p>
In this part I found any errors. First I don't have installed Scala (Yea)
Second, my Java version it was RE 1.8, PlayFramework version 2.8.9 is supported for Java 8 and 11.
I uninstalled and installed the JDK 11.0.17 and it's works.
</p>

## vscode_java_buildpipeline

* javac -sourcepath src -classpath classes;lib\Banners.jar src\farewells\GoodBye.java -d classes
* jar cfm jar-file manifest-addition input-file(s)


<br>

- [x] Setup build bat
- [x] Compile with javac
- [x] Build jar cmd
- [x] Pack in .vscode tasks
- [ ] launch4jc usage: launch4j config.xml
- [ ] distinguish windows/linux

``` 
{
  "label": "Run Node",
  "type": "process",
  "windows": {
    "command": "C:\\Program Files\\nodejs\\node.exe"
  },
  "linux": {
    "command": "/usr/bin/node"
  }
}
```


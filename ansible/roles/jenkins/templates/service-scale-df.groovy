node("cd") {
    git url: "https://github.com/wangyun1517/${serviceName}.git"
    dockerFlow(serviceName, ["scale", "proxy"], ["--scale=\"" + scale + "\""])
}
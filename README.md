# Concurrentia

Introducing "Concurrentia" – an open-source Java and Kotlin library designed to streamline your multi-threading
experience. Our solution simplifies concurrent execution, allowing you to effortlessly run multiple tasks
simultaneously.

With "Concurrentia," there's no need for complex configurations. The library intelligently adapts to your system's
capabilities, ensuring optimal performance without any manual intervention. However, should you require it, you have the
option to adjust the maximum thread count to align with your specific requirements.

Experience the efficiency of parallel processing with "Concurrentia" – where simplicity meets professionalism,
empowering you to focus on what truly matters: your code.

[ ![Discord](https://canary.discordapp.com/api/guilds/729950513352933386/widget.png) ](https://discord.gg/jsSGFeR)
[ ![Latest Release](https://img.shields.io/badge/Latest%20Release-v1.0.3-orange)](https://github.com/Altiran/concurrentia/releases/tag/v1.0.3)
[ ![GitHub Forks](https://img.shields.io/github/forks/Altiran/concurrentia.svg)](https://github.com/Altiran/concurrentia/fork)
[ ![GitHub Stars](https://img.shields.io/github/stars/Altiran/concurrentia.svg)](https://github.com/Altiran/concurrentia/stargazers)
[ ![GitHub Watches](https://img.shields.io/github/watchers/Altiran/concurrentia.svg)](https://github.com/Altiran/concurrentia/watchers)
[ ![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://github.com/Altiran/concurrentia/graphs/commit-activity)
[ ![Maintainer](https://img.shields.io/badge/Maintainer-Altiran_Studios-blue)](https://github.com/Altiran)
[ ![Build Status](https://github.com/Altiran/concurrentia/actions/workflows/main.yml/badge.svg "Build Status")](https://github.com/Altiran/concurrentia)
[ ![WakaTime](https://wakatime.com/badge/github/Altiran/concurrentia.svg)](https://wakatime.com/badge/github/Altiran/concurrentia)

**Like the project? Make sure to leave a ⭐ on the repository!**

## Downloads

##### Gradle:

```groovy
repositories {
    maven {
        name 'concurrentia'
        url 'https://raw.githubusercontent.com/Altiran/concurrentia/main/repo'
    }
}
```

```groovy
dependencies {
    implementation 'com.altiran:concurrentia:1.0.3'
}
```

##### Maven:

```xml

<repository>
    <id>concurrentia</id>
    <url>https://raw.githubusercontent.com/Altiran/concurrentia/main/repo</url>
</repository>
```

```xml

<dependency>
    <groupId>com.altiran</groupId>
    <artifactId>concurrentia</artifactId>
    <version>1.0.3</version>
</dependency>
```

##### JAR:

Pre-built JAR downloads are available from [GitHub Releases](https://github.com/altiran/concurrentia/releases).

## How to Use?

##### Java Example:

```java
import com.altiran.concurrentia.Concurrentia;
import com.altiran.concurrentia.strategy.MultithreadingProtocol;

public class AsyncExample {
    private MultithreadingProtocol mt;
    private Concurrentia instance;

    public AsyncExample() {
        instance = new Concurrentia();
        mt = instance.getMultiThreading();
    }

    public void main() {
        mt.run(() -> {
            System.out.println("Hello World!"); // This will be executed in a separate thread asynchronously
        });
    }
}
```

##### Kotlin Example:

```kotlin
import com.altiran.concurrentia.Concurrentia
import com.altiran.concurrentia.strategy.MultithreadingProtocol

class AsyncExample {
    private val mt: MultithreadingProtocol
    private val instance = Concurrentia()

    init {
        mt = instance.multiThreading
    }

    fun main() {
        mt.run {
            println("Hello World!") // This will be executed in a separate thread asynchronously
        }
    }
}
```

## I Need Help

Check out the [Wiki tab](https://github.com/Altiran/concurrentia/wiki).
If you are still stuck, join [our Discord server](https://discord.gg/jsSGFeR).

## License

"Concurrentia" is licensed under the [GNU General Public License v3.0](https://www.gnu.org/licenses/gpl-3.0.html).
See [LICENSE.md](https://github.com/Altiran/concurrentia/blob/main/LICENSE.md) for details.

<!-- MADE WITH ❤️ BY ALTIRAN -->

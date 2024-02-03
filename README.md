<h3 align="center"> <samp>⚙️ GRADLE</samp> </h3>

```kotlin
repositories {
    // JitPack
    maven("https://jitpack.io")
}

dependencies {
    // Ranks-API 
    compileOnly("com.github.SilexMC:RanksAPI:1.0.0")
}
```

<br />

<h3 align="center"> <samp>⚙️ MAVEN</samp> </h3>

```xml
<repositories>
    <!-- JitPack -->
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <!-- Ranks-API -->
    <dependency>
        <groupId>com.github.SilexMC</groupId>
        <artifactId>RanksAPI</artifactId>
        <version>1.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

<br />

<h3 align="center"> <samp>🖥 EXAMPLE ON HOW TO USE</samp> </h3>

```java
import com.github.silexmc.ranks.api.RanksAPI;

public class PluginClass extends JavaPlugin {
    @Override
    public void onEnable() {
        if (!Bukkit.getPluginManager().isPluginEnabled("Ranks")) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }

        RegisteredServiceProvider<RanksAPI> service = Bukkit.getServicesManager().getRegistration(RanksAPI.class);
        if (service == null) {
            Bukkit.getPluginManager().disablePlugin(this);
            return;
        }
        this.ranksAPI = service.getProvider();
    }
}
```
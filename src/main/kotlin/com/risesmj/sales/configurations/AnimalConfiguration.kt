import com.risesmj.sales.configurations.Animal
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AnimalConfiguration {

    @Bean("dog")
    fun dog(): Animal {
        return object: Animal{
            override fun yap() {
                print("Au Au")
            }

        }
    }

    @Bean("cat")
    fun cat(): Animal {
        return object: Animal{
            override fun yap() {
                print("Miau Miau")
            }

        }
    }
}
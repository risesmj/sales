import com.risesmj.sales.annotations.Dev
import org.springframework.context.annotation.Bean

@Dev
class MyConfiguration {

    @Bean("applicationName")
    fun applicationName(): String{
        return "Sales System"
    }
}
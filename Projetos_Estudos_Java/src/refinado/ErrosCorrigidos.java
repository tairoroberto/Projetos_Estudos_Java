package refinado;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**Restringir a Anotação para classe e métodos*/
@Target({ElementType.TYPE,ElementType.METHOD})

public @interface ErrosCorrigidos {
	String[] erros();
}

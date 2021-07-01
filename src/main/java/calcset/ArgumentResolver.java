package calcset;

import java.io.InputStream;

public interface ArgumentResolver { //인자 받기위해서 만든 인터페이스
    Argument resolve(InputStream stream);
}

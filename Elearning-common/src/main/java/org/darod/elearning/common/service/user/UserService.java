package org.darod.elearning.common.service.user;

import org.darod.elearning.common.exception.BusinessException;
import org.darod.elearning.common.service.user.model.UserModel;

/**
 * @author Darod
 * @version 1.0
 * @date 2019/6/20 0020 9:19
 */
public interface UserService {
    UserModel getUserById(int id);

    void register(UserModel userModel) throws BusinessException;

    UserModel validataLogin(String telphone, String encrptPassword) throws BusinessException;

    String hello();
}

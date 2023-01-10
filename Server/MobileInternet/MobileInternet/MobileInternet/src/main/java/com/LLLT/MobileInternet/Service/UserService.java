// User Service Interface
/*
 *  @Author : SeeChen Lee, ViHang Tan
 *  @Contact: leeseechen@petalmail.com,
 */

/*      啊啊啊啊啊啊啊啊 哦哦哦哦哦哦哦哦哦
 *_______________#########_______________________
 *______________############_____________________
 *______________#############____________________
 *_____________##__###########___________________
 *____________###__######_#####__________________
 *____________###_#######___####_________________
 *___________###__##########_####________________
 *__________####__###########_####_______________
 *________#####___###########__#####_____________
 *_______######___###_########___#####___________
 *_______#####___###___########___######_________
 *______######___###__###########___######_______
 *_____######___####_##############__######______
 *____#######__#####################_#######_____
 *____#######__##############################____
 *___#######__######_#################_#######___
 *___#######__######_######_#########___######___
 *___#######____##__######___######_____######___
 *___#######________######____#####_____#####____
 *____######________#####_____#####_____####_____
 *_____#####________####______#####_____###______
 *______#####______;###________###______#________
 *________##_______####________####______________
 */
package com.LLLT.MobileInternet.Service;

import com.LLLT.MobileInternet.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

// 定义用户接口
// Last Modified by SeeChen Lee @ 10-Jan-2023 00:10
@Service
public interface UserService {

    public String createUser(String userEmail, String userPass); // 用于创建新用户

    public String userLogin(String userEmail, String userPass); // 用户登录

    public String userDelete(String userId); // 删除用户，可以利用验证？

    public Boolean updateUserBasicInfo(User user); // 更新用户基本信息

    public Boolean updateUserPassword(User user); // 更新用户密码

    public Boolean updateUserEmail(User user); // 更新用户邮箱

    public User getUserInfo(String userId);    // 用于获取用户资料

    public Boolean emailExists(String email); // 用于判断当前邮箱是否已经注册

    public Boolean updateFollow(String myId, String followId); //更新用户注册

}

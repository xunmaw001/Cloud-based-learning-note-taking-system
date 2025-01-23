export function isAuth(tableName, key) {
  let role = localStorage.getItem("UserTableName");
  let menus = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"笔记本","menuJump":"列表","tableName":"bijiben"}],"menu":"笔记本管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","修改","删除","查看评论"],"menu":"笔记分享","menuJump":"列表","tableName":"bijifenxiang"}],"menu":"笔记分享管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"分享类型","menuJump":"列表","tableName":"fenxiangleixing"}],"menu":"分享类型管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论"],"menu":"学习资料","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","发送资料"],"menu":"购买资料","menuJump":"列表","tableName":"goumaiziliao"}],"menu":"购买资料管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"完整资料","menuJump":"列表","tableName":"wanzhengziliao"}],"menu":"完整资料管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","修改"],"menu":"关于我们","tableName":"aboutus"},{"appFrontIcon":"cuIcon-wenzi","buttons":["查看","修改"],"menu":"系统简介","tableName":"systemintro"},{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"通知公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"笔记分享列表","menuJump":"列表","tableName":"bijifenxiang"}],"menu":"笔记分享模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","查看评论","购买资料"],"menu":"学习资料列表","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["新增","查看","修改","删除"],"menu":"笔记本","menuJump":"列表","tableName":"bijiben"}],"menu":"笔记本管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除","查看评论"],"menu":"笔记分享","menuJump":"列表","tableName":"bijifenxiang"}],"menu":"笔记分享管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","删除","支付"],"menu":"购买资料","menuJump":"列表","tableName":"goumaiziliao"}],"menu":"购买资料管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"完整资料","menuJump":"列表","tableName":"wanzhengziliao"}],"menu":"完整资料管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-present","buttons":["查看"],"menu":"笔记分享列表","menuJump":"列表","tableName":"bijifenxiang"}],"menu":"笔记分享模块"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","查看评论","购买资料"],"menu":"学习资料列表","menuJump":"列表","tableName":"xuexiziliao"}],"menu":"学习资料模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}];
  for(let i=0;i<menus.length;i++){
    if(menus[i].tableName==role){
      for(let j=0;j<menus[i].frontMenu.length;j++){
          for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
            if(tableName==menus[i].frontMenu[j].child[k].tableName){
              let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
              return buttons.indexOf(key) !== -1 || false
            }
          }
      }
    }
  }
  return false;
}

/**
 *  * 获取当前时间（yyyy-MM-dd hh:mm:ss）
 *   */
export function getCurDateTime() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate(),
    hour = currentTime.getHours(),
    minute = currentTime.getMinutes(),
    second = currentTime.getSeconds();
    return year + "-" + month + "-" + day + " " +hour +":" +minute+":"+second;
}

/**
 *  * 获取当前日期（yyyy-MM-dd）
 *   */
export function getCurDate() {
    let currentTime = new Date(),
    year = currentTime.getFullYear(),
    month = currentTime.getMonth() + 1 < 10 ? '0' + (currentTime.getMonth() + 1) : currentTime.getMonth() + 1,
    day = currentTime.getDate() < 10 ? '0' + currentTime.getDate() : currentTime.getDate();
    return year + "-" + month + "-" + day;
}

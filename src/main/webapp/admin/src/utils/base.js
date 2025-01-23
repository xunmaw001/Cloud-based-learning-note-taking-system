const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm44va6/",
            name: "ssm44va6",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm44va6/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: " 基于云的学习笔记系统设计与开发 "
        } 
    }
}
export default base

package day17.service;

import day17.domin.*;

public class TeamService {
    private static int counter=1;
    private final int MAX_MEMBER=5;
    private Programmer[] team=new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
        super();
    }

    public Programmer[] getTeam(){
        Programmer[] team=new Programmer[total];
        for (int i = 0; i <team.length ; i++) {
            team[i]=this.team[i];
        }
        return team;
    }

    //添加成员
    public void addMember(Employee e) throws TeamException{
        if(total>=MAX_MEMBER){
            throw new TeamException("成员已满，无法添加");
        }
        if(!(e instanceof Programmer)){
            throw new TeamException("不是开发人员，无法添加");
        }
        if (isExist(e)){
            throw new TeamException("已在开发团队中");
        }

        Programmer p=(Programmer)e;
        if("BUSY".equals(p.getStatus().getNAME())){
            throw new TeamException("已是某对开发人员");
        }else if ("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("正在休假，无法添加");
        }

        int numOfArch=0,numOfDes=0,numOfPro=0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect){
                numOfArch++;
            }else if (team[i] instanceof Desinger){
                numOfDes++;
            }else if (team[i] instanceof Programmer){
                numOfPro++;
            }
        }
        if (p instanceof Architect){
            if (numOfArch>=1){
                throw new TeamException("只有一名架构师");
            }
        }else if(p instanceof Desinger){
            if(numOfDes>=2){
                throw new TeamException("只能有两名设计师");
            }
        }else if(p instanceof Programmer){
            if(numOfPro>=3){
                throw new TeamException("智能有三名程序员");
            }
        }

        team[total++]=p;
        p.setMemberID(counter++);
        p.setStatus(Status.BUSY);



    }

    public boolean isExist(Employee e){

        for (int i=0;i<total;i++){
            return team[i].getId()==e.getId();
        }
        return false;
    }

    public void removeMember(int memberId) throws TeamException{
        int n = 0;
        //找到指定memberId的员工，并删除
        for (; n < total; n++) {
            if (team[n].getMemberID() == memberId) {
                team[n].setStatus(Status.FREE);
                break;
            }
        }
        //如果遍历一遍，都找不到，则报异常
        if (n == total)
            throw new TeamException("找不到该成员，无法删除");
        //后面的元素覆盖前面的元素
        for (int i = n + 1; i < total; i++) {
            team[i - 1] = team[i];
        }
        team[--total] = null;
    }
}

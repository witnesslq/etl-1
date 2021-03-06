package cn.jdworks.etl.executor.module;

import org.nutz.ioc.loader.annotation.Inject;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.POST;

import cn.jdworks.etl.executor.biz.TaskManager;

@IocBean
@At("/exe")
@Ok("json")
@Fail("http:500")
public class ExeModule {

	private final Log LOG = Logs.getLog(this.getClass());

	@Inject
	private TaskManager taskManager;

	//Do not delete
	//Leave it for test
	@At
	public void foo(){
		
	}
	
	@At
	@POST
	public boolean task(int id, String cmd){
		
		LOG.debugf("[%d]:\"%s\"", id, cmd);
		
		return this.taskManager.runTask(id, cmd);
	}

}

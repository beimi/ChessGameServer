package info.xiaomo.server.shared.entity.room;

import info.xiaomo.gengine.persist.mongo.IConfigChecker;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;


/**
 * 房间配置
 *
 *
 * 2017年10月19日 上午11:42:31
 */
@Entity(value = "c_room", noClassnameStored = true)
public class CRoom implements IConfigChecker {
	@Id
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}

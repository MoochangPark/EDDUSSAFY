package com.ssafy.db.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QRoom is a Querydsl query type for Room
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QRoom extends EntityPathBase<Room> {

    private static final long serialVersionUID = 846449565L;

    public static final QRoom room = new QRoom("room");

    public final StringPath desc = createString("desc");

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath password = createString("password");

    public final DateTimePath<java.time.LocalDateTime> roomEndTime = createDateTime("roomEndTime", java.time.LocalDateTime.class);

    public final NumberPath<Long> roomId = createNumber("roomId", Long.class);

    public final DateTimePath<java.time.LocalDateTime> roomStartTime = createDateTime("roomStartTime", java.time.LocalDateTime.class);

    public final StringPath title = createString("title");

    public QRoom(String variable) {
        super(Room.class, forVariable(variable));
    }

    public QRoom(Path<? extends Room> path) {
        super(path.getType(), path.getMetadata());
    }

    public QRoom(PathMetadata metadata) {
        super(Room.class, metadata);
    }

}


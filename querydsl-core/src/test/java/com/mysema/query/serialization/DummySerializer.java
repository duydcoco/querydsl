package com.mysema.query.serialization;

import com.mysema.query.types.SubQuery;
import com.mysema.query.types.Templates;

public class DummySerializer extends SerializerBase<DummySerializer>{

    public DummySerializer(Templates patterns) {
	super(patterns);
    }

    @Override
    public void visit(SubQuery<?> query) {
	// TODO Auto-generated method stub	
    }

}

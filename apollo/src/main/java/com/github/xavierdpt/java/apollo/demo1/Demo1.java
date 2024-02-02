package com.github.xavierdpt.java.apollo.demo1;

import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.xavierdpt.java.apollo.AbstractDemo;
import com.github.xavierdpt.java.apollo.demo1.entities.Person;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;

import java.util.Map;

/**
 * This demo persists a Person entity, then loads it by id
 */
public class Demo1 extends AbstractDemo {

    public Demo1() {
    }

    private void demo() {
        final Metadata metadata = initHibernate();
        try (SessionFactory sessionFactory = metadata.buildSessionFactory()) {
            sessionFactory.inTransaction(session -> {
                final Person person = new Person();
                person.setId(0L);
                person.setName("John");
                person.setDateOfBirth(1987);
                session.persist(person);
            });
            sessionFactory.inTransaction(session -> {
                final IdentifierLoadAccess<Person> loader = session.byId(Person.class);
                final Person person = loader.load(0L);
                System.out.println(person.getName());
                System.out.println(person.getId());
                final ObjectNode json = person.toJson(objectMapper);
                writeJson(json);
            });
        }
    }

    private Metadata initHibernate() {
        final StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
        builder.applySettings(Map.of(
                AvailableSettings.JAKARTA_JDBC_URL, "jdbc:h2:mem:test",
                AvailableSettings.JAKARTA_JDBC_USER, "sa",
                AvailableSettings.JAKARTA_JDBC_PASSWORD, "",
                AvailableSettings.SHOW_SQL, true,
                AvailableSettings.HBM2DDL_AUTO, "create"
        ));
        final StandardServiceRegistry registry = builder.build();
        final MetadataSources metadataSources = new MetadataSources(registry);
        metadataSources.addAnnotatedClass(Person.class);
        return metadataSources.buildMetadata();
    }

    public static void main(String[] args) {
        new Demo1().demo();
    }
}

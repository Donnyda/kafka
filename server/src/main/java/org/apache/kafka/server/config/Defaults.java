/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.kafka.server.config;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.common.metrics.Sensor;
import org.apache.kafka.raft.RaftConfig;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Defaults {
    /** ********* General Configuration *********/
    public static final boolean BROKER_ID_GENERATION_ENABLE = true;
    public static final int MAX_RESERVED_BROKER_ID = 1000;
    public static final int BROKER_ID = -1;
    public static final int NUM_NETWORK_THREADS = 3;
    public static final int NUM_IO_THREADS = 8;
    public static final int BACKGROUND_THREADS = 10;
    public static final int QUEUED_MAX_REQUESTS = 500;
    public static final int QUEUED_MAX_REQUEST_BYTES = -1;
    public static final int INITIAL_BROKER_REGISTRATION_TIMEOUT_MS = 60000;
    public static final int BROKER_HEARTBEAT_INTERVAL_MS = 2000;
    public static final int BROKER_SESSION_TIMEOUT_MS = 9000;
    public static final int METADATA_SNAPSHOT_MAX_NEW_RECORD_BYTES = 20 * 1024 * 1024;
    public static final long METADATA_SNAPSHOT_MAX_INTERVAL_MS = TimeUnit.HOURS.toMillis(1);
    public static final int METADATA_MAX_IDLE_INTERVAL_MS = 500;
    public static final int METADATA_MAX_RETENTION_BYTES = 100 * 1024 * 1024;
    public static final boolean DELETE_TOPIC_ENABLE = true;
    public static final int REQUEST_TIMEOUT_MS = 30000;
    public static final long CONNECTION_SETUP_TIMEOUT_MS = CommonClientConfigs.DEFAULT_SOCKET_CONNECTION_SETUP_TIMEOUT_MS;
    public static final long CONNECTION_SETUP_TIMEOUT_MAX_MS = CommonClientConfigs.DEFAULT_SOCKET_CONNECTION_SETUP_TIMEOUT_MAX_MS;

    /** ********* KRaft mode configs *********/
    public static final int EMPTY_NODE_ID = -1;
    public static final long SERVER_MAX_STARTUP_TIME_MS = Long.MAX_VALUE;
    public static final int MIGRATION_METADATA_MIN_BATCH_SIZE = 200;

    /** ********* Authorizer Configuration *********/
    public static final String AUTHORIZER_CLASS_NAME = "";

    /** ********* Controlled shutdown configuration *********/
    public static final int CONTROLLED_SHUTDOWN_MAX_RETRIES = 3;
    public static final int CONTROLLED_SHUTDOWN_RETRY_BACKOFF_MS = 5000;
    public static final boolean CONTROLLED_SHUTDOWN_ENABLE = true;

    /** ********* Fetch Configuration *********/
    public static final int MAX_INCREMENTAL_FETCH_SESSION_CACHE_SLOTS = 1000;
    public static final int FETCH_MAX_BYTES = 55 * 1024 * 1024;

    /** ********* Request Limit Configuration ***********/
    public static final int MAX_REQUEST_PARTITION_SIZE_LIMIT = 2000;

    /** ********* Quota Configuration *********/
    public static final int NUM_QUOTA_SAMPLES = ClientQuotaManagerConfig.DEFAULT_NUM_QUOTA_SAMPLES;
    public static final int QUOTA_WINDOW_SIZE_SECONDS = ClientQuotaManagerConfig.DEFAULT_QUOTA_WINDOW_SIZE_SECONDS;
    public static final int NUM_REPLICATION_QUOTA_SAMPLES = ReplicationQuotaManagerConfig.DEFAULT_NUM_QUOTA_SAMPLES;
    public static final int REPLICATION_QUOTA_WINDOW_SIZE_SECONDS = ReplicationQuotaManagerConfig.DEFAULT_QUOTA_WINDOW_SIZE_SECONDS;
    public static final int NUM_ALTER_LOG_DIRS_REPLICATION_QUOTA_SAMPLES = ReplicationQuotaManagerConfig.DEFAULT_NUM_QUOTA_SAMPLES;
    public static final int ALTER_LOG_DIRS_REPLICATION_QUOTA_WINDOW_SIZE_SECONDS = ReplicationQuotaManagerConfig.DEFAULT_QUOTA_WINDOW_SIZE_SECONDS;
    public static final int NUM_CONTROLLER_QUOTA_SAMPLES = ClientQuotaManagerConfig.DEFAULT_NUM_QUOTA_SAMPLES;
    public static final int CONTROLLER_QUOTA_WINDOW_SIZE_SECONDS = ClientQuotaManagerConfig.DEFAULT_QUOTA_WINDOW_SIZE_SECONDS;

    /** ********* Kafka Metrics Configuration *********/
    public static final int METRIC_NUM_SAMPLES = 2;
    public static final int METRIC_SAMPLE_WINDOW_MS = 30000;
    public static final String METRIC_REPORTER_CLASSES = "";
    public static final String METRIC_RECORDING_LEVEL = Sensor.RecordingLevel.INFO.toString();
    public static final boolean AUTO_INCLUDE_JMX_REPORTER = true;

    /**  ********* Kafka Yammer Metrics Reporter Configuration *********/
    public static final String KAFKA_METRIC_REPORTER_CLASSES = "";
    public static final int KAFKA_METRICS_POLLING_INTERVAL_SECONDS = 10;


    /** ********* Kafka Client Telemetry Metrics Configuration *********/
    public static final int CLIENT_TELEMETRY_MAX_BYTES = 1024 * 1024;

    /**  ********* Delegation Token Configuration *********/
    public static final long DELEGATION_TOKEN_MAX_LIFE_TIME_MS = 7 * 24 * 60 * 60 * 1000L;
    public static final long DELEGATION_TOKEN_EXPIRY_TIME_MS = 24 * 60 * 60 * 1000L;
    public static final long DELEGATION_TOKEN_EXPIRY_CHECK_INTERVAL_MS = 1 * 60 * 60 * 1000L;


    /**  ********* Raft Quorum Configuration *********/
    public static final List<String> QUORUM_VOTERS = RaftConfig.DEFAULT_QUORUM_VOTERS;
    public static final int QUORUM_ELECTION_TIMEOUT_MS = RaftConfig.DEFAULT_QUORUM_ELECTION_TIMEOUT_MS;
    public static final int QUORUM_FETCH_TIMEOUT_MS = RaftConfig.DEFAULT_QUORUM_FETCH_TIMEOUT_MS;
    public static final int QUORUM_ELECTION_BACKOFF_MS = RaftConfig.DEFAULT_QUORUM_ELECTION_BACKOFF_MAX_MS;
    public static final int QUORUM_LINGER_MS = RaftConfig.DEFAULT_QUORUM_LINGER_MS;
    public static final int QUORUM_REQUEST_TIMEOUT_MS = RaftConfig.DEFAULT_QUORUM_REQUEST_TIMEOUT_MS;
    public static final int QUORUM_RETRY_BACKOFF_MS = RaftConfig.DEFAULT_QUORUM_RETRY_BACKOFF_MS;
}

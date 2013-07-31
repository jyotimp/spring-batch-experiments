package kr.experiments.springbatch.test;

import lombok.Setter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

import java.util.Date;

/**
 * kr.experiments.springbatch.test.SpringSchedulingLauncher
 *
 * @author 배성혁 sunghyouk.bae@gmail.com
 * @since 13. 7. 31. 오후 4:51
 */
public class SpringSchedulingLauncher {

    @Setter Job job;

    @Setter JobLauncher jobLauncher;

    public void launch() throws Exception {
        JobParameters jobParameters = createJobParameters();
        jobLauncher.run(job, jobParameters);
    }

    private JobParameters createJobParameters() {
        return new JobParametersBuilder()
            .addDate("date", new Date())
            .toJobParameters();
    }
}

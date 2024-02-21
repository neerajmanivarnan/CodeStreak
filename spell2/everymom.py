def merge_overlapping_slots(timeslots):
    """
    Merges overlapping timeslots in a list of integers.

    Args:
        timeslots: A list of integers representing starting and ending times.

    Returns:
        A list of merged timeslots as pairs of integers,
        preserving the original input format.
    """

    if len(timeslots) % 2 != 0:
        raise ValueError("Uneven number of timeslots provided.")

    # Group timeslots into pairs to represent start and end times
    pairs = [[] for _ in range(len(timeslots) // 2)]
    for i in range(0, len(timeslots), 2):
        pairs[i // 2] = [timeslots[i], timeslots[i + 1]]

    # Validate timeslot format (optional, you can remove this as needed)
    for start, end in pairs:
        if start >= end:
            raise ValueError(f"Invalid timeslot: {start} to {end} (start must be before end).")

    # Sort timeslots by their starting times
    pairs.sort(key=lambda x: x[0])

    # Initialize merged intervals and current interval
    merged_intervals = []
    current_interval = []

    for start, end in pairs:
        # Check for overlap and extend current interval if necessary
        if merged_intervals and end > current_interval[1]:
            current_interval[1] = max(current_interval[1], end)
        else:
            # No overlap, add current interval (if any) and start a new one
            if current_interval:
                merged_intervals.append(current_interval)
            current_interval = [start, end]

    # Add remaining interval if any
    if current_interval:
        merged_intervals.append(current_interval)

    return merged_intervals

# Sample input
timeslots = [3, 1, 4, 2, 5, 6, 7]

# Merge timeslots and print the result
merged_intervals = merge_overlapping_slots(timeslots)
print("Merged timeslots:")
for start, end in merged_intervals:
    print(f"{start} {end}")
